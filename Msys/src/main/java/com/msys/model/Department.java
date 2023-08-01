package com.msys.model;

public enum Department {

    RMG("RMG"),
    HR("Hr"),
    IT("IT"),
    FINANCE("FINANCE"),
    TECHNICAL_SUPPORT("TECHNICAL SUPPORT"),
    ENGINEER("ENGINEER"),
    marketing("marketing"),
    SALES("SALES");

    private final String department;

    Department(String department) {
        System.out.println(department);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

}
