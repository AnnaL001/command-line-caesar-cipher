package com.anna.command_line_caesar_cipher.model.parameter_resolver;

import com.anna.command_line_caesar_cipher.model.Encryption;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class EncryptionParameterResolver implements ParameterResolver {
  @Override
  public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
    return parameterContext.getParameter().getType() == Encryption.class;
  }

  @Override
  public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
    return new Encryption("", 0);
  }
}
