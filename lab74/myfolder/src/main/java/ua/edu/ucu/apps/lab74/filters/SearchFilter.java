package ua.edu.ucu.apps.lab74.filters;

import ua.edu.ucu.apps.lab74.flowers.Item;

public interface SearchFilter {
    boolean match(Item item);
}
