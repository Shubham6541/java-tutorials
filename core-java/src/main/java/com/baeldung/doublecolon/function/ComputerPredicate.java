package com.nklkarthi.doublecolon.function;

import com.nklkarthi.doublecolon.Computer;

@FunctionalInterface
public interface ComputerPredicate {

    boolean filter(Computer c);

}
