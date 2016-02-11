package com.agualis.refactoring.dataclass;

public class Course {

    private final String name;
    private final boolean isAdvanced;

    public Course (String name, boolean isAdvanced) {
        this.name = name;
        this.isAdvanced = isAdvanced;
    }

    public boolean isAdvanced() {
        return isAdvanced;
    }


}
