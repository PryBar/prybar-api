package net.stickycode.prybar.pivot;

public interface PrybarRuntime {

  boolean hasFailures();

  <T> T require(PrybarComponentLookup lookup);

  void wire();

  void failure(PrybarMessage e);

  void register(PrybarComponent i);

  <T> T find(Class<T> type);

}
