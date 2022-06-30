package com.etz.population.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.function.Supplier;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "I could not find the kini ya looking for")
public class NotFoundException extends RuntimeException  {
    public NotFoundException(String message)  {
      super(message);
  }


}
