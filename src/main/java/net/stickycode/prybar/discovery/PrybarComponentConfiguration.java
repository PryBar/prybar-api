package net.stickycode.prybar.discovery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrybarComponentConfiguration
    implements Iterable<PrybarConfiguredField> {

  private List<PrybarConfiguredField> fields = new ArrayList<>();

  public boolean hasConfiguration() {
    return !fields.isEmpty();
  }

  @Override
  public Iterator<PrybarConfiguredField> iterator() {
    return fields.iterator();
  }

  public void add(PrybarConfiguredField prybarConfiguredField) {
    fields.add(prybarConfiguredField);
  }

}
