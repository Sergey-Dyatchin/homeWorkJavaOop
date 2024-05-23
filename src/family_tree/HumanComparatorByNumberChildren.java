package family_tree;

import human.Human;

import java.util.Comparator;

public class HumanComparatorByNumberChildren implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getChildren().size(), o2.getChildren().size());
    }
}