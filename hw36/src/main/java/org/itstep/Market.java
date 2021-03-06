package org.itstep;

import java.util.ArrayList;
import java.util.List;

public class Market implements Report {
    private List<Report> reports = new ArrayList<>();
    public Iterator getIterator(){
        return new NumbersIterator();
    }
    private class NumbersIterator implements Iterator {
        int ind;

        @Override
        public boolean hasNext() {
            return ind < reports.size();
        }

        @Override
        public Object next() {
            if (this.hasNext()) return reports.toArray()[ind++];
            return null;
        }
    }

    @Override
    public void report() {
        System.out.println("Report from subdivision Market department:");
        for (Report report : reports) {
            System.out.print("    ");
            report.report();
        }
    }

    public void add(Report r) {
        this.reports.add(r);
    }

    void remove(Report r) {
        this.reports.remove(r);
    }

    @Override
    public String toString() {
        return "Report from subdivision Market department";
    }
}
