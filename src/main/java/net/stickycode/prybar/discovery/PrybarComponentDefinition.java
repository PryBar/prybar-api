package net.stickycode.prybar.discovery;

public class PrybarComponentDefinition {

  private String type;

  private PrybarComponentWiring wiring;

  public PrybarComponentDefinition(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

}
