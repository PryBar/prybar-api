package net.stickycode.prybar.discovery;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrybarDefinitionRegistry
    implements Iterable<PrybarComponentDefinition> {

  private Map<String, PrybarComponentDefinition> definitions = new LinkedHashMap<>();

  public PrybarDefinitionRegistry register(PrybarComponentDefinition definition) {
    definitions.put(definition.getType(), definition);
    return this;
  }

  public boolean hasComponent(String name) {
    return definitions.containsKey(name);
  }

  @Override
  public Iterator<PrybarComponentDefinition> iterator() {
    return definitions.values().iterator();
  }

}
