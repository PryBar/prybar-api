package net.stickycode.prybar.pivot;

public interface PrybarComponent {

  default void wire(PrybarRuntime prybar) {
  }

  default void configure(PrybarRuntime prybar) {
  }

}
