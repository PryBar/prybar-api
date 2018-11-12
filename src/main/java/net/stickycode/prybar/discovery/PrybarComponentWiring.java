package net.stickycode.prybar.discovery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrybarComponentWiring
    implements Iterable<PrybarComponentDependency> {

  private List<PrybarComponentDependency> dependencies = new ArrayList<>();

  @Override
  public Iterator<PrybarComponentDependency> iterator() {
    return dependencies.iterator();
  }

  public PrybarComponentWiring add(PrybarComponentDependency d) {
    dependencies.add(d);
    return this;
  }

  public boolean hasDependencies() {
    return !dependencies.isEmpty();
  }

}
