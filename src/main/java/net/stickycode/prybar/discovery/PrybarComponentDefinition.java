package net.stickycode.prybar.discovery;

public class PrybarComponentDefinition {

  private String type;

  private PrybarComponentWiring wiring = new PrybarComponentWiring();

  private PrybarComponentConfiguration configuration = new PrybarComponentConfiguration();

  public PrybarComponentDefinition(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public PrybarComponentWiring getComponentWiring() {
    return wiring;
  }

  public String getTypePath() {
    return type.replaceAll("\\.", "/");
  }

  public String getTypeReference() {
    return "L" + getTypePath() + ";";
  }

  public boolean hasWiring() {
    return wiring.hasDependencies();
  }

  public boolean hasConfiguration() {
    return configuration.hasConfiguration();
  }

  public PrybarComponentConfiguration getConfiguration() {
    return configuration;
  }

}
