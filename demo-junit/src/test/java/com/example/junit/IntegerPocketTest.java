package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class IntegerPocketTest {

  // !!! inject a fake object (all instance without actual implementation)
  @Mock
  private IntegerOperationManager operationManager;

  @Test
  void testSum() {
    // Assumption
    Mockito.when(operationManager.sum()).thenReturn(999);


    // Test
    IntegerPocket integerPocket = new IntegerPocket(this.operationManager);
    integerPocket.add(3);
    integerPocket.add(10);
    integerPocket.add(2);
    int result = integerPocket.sum();
    assertEquals(1002, result);
  }
}
