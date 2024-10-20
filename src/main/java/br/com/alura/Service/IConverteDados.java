package br.com.alura.Service;

public interface IConverteDados {
  <T> T obterDados(String Json, Class<T> classe);
}
