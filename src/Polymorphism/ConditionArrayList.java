package Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConditionArrayList extends ArrayList<Integer> {
  private final Predicate<Integer> condition;

  public ConditionArrayList(Predicate<Integer> predicate, Integer... nums) {
    super(Arrays.stream(nums)
        .filter(predicate::test)
        .collect(Collectors.toList()));
    this.condition = predicate;
  }

  @Override
  public boolean add(Integer element) {
    if (isEligible(element)) {
      return super.add(element);
    } else {
      System.out.println("Only odd numbers are allowed. Skipping: " + element);
      return false;
    }
  }

  @Override
  public void add(int index, Integer element) {
    if (isEligible(element)) {
      super.add(index, element);
    } else {
      System.out.println("Only odd numbers are allowed. Skipping: " + element);
    }
  }

  @Override
  public boolean addAll(Collection<? extends Integer> c) {
    return super.addAll(c.stream()
        .filter(this::isEligible)
        .collect(Collectors.toList()));
  }

  @Override
  public boolean addAll(int index, Collection<? extends Integer> c) {
    return super.addAll(index, c.stream()
        .filter(this::isEligible)
        .collect(Collectors.toList()));
  }

  public boolean isEligible(Integer element) {
    return condition.test(element);
  }

}
