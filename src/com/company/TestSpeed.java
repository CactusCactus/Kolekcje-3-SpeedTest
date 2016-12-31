package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Comarch on 2016-12-31.
 */
public class TestSpeed {
    ArrayList<String> arrayList;
    LinkedList<String> linkedList;

    private static final String SAMPLE_TEXT = "blablabla";

    private void init() {
        arrayList = new ArrayList<>();
        arrayList.add(SAMPLE_TEXT);
        arrayList.add(SAMPLE_TEXT);
        arrayList.add(SAMPLE_TEXT);

        linkedList = new LinkedList<>();
        linkedList.add(SAMPLE_TEXT);
        linkedList.add(SAMPLE_TEXT);
        linkedList.add(SAMPLE_TEXT);
    }
    public void test() {
        init();
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        addToArrayBeginning();
        endTime = System.nanoTime();
        System.out.println("addToArrayBeginning: " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        addToLinkedBeginning();
        endTime = System.nanoTime();
        System.out.println("addToLinkedBeginning: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        addToArrayMiddle();
        endTime = System.nanoTime();
        System.out.println("addToArrayMiddle: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        addToLinkedMiddle();
        endTime = System.nanoTime();
        System.out.println("addToLinkedMiddle: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        addToArrayEnd();
        endTime = System.nanoTime();
        System.out.println("addToArrayEnd: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        addToLinkedEnd();
        endTime = System.nanoTime();
        System.out.println("addToLinkedEnd: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        removeFromArrayBeginning();
        endTime = System.nanoTime();
        System.out.println("removeFromArrayBeginning: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        removeFromLinkedBeginning();
        endTime = System.nanoTime();
        System.out.println("removeFromLinkedBeginning: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        removeFromArrayMiddle();
        endTime = System.nanoTime();
        System.out.println("removeFromArrayMiddle: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        removeFromLinkedMiddle();
        endTime = System.nanoTime();
        System.out.println("removeFromLinkedMiddle: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        removeFromArrayEnd();
        endTime = System.nanoTime();
        System.out.println("removeFromArrayEnd: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        removeFromLinkedEnd();
        endTime = System.nanoTime();
        System.out.println("removeFromLinkedEnd: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        getFromArrayBeginning();
        endTime = System.nanoTime();
        System.out.println("getFromArrayBeginning: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        getFromLinkedBeginning();
        endTime = System.nanoTime();
        System.out.println("getFromLinkedBeginning: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        getFromArrayMiddle();
        endTime = System.nanoTime();
        System.out.println("getFromArrayMiddle: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        getFromLinkedMiddle();
        endTime = System.nanoTime();
        System.out.println("getFromLinkedMiddle: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        getFromArrayEnd();
        endTime = System.nanoTime();
        System.out.println("getFromArrayEnd: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();
        getFromLinkedEnd();
        endTime = System.nanoTime();
        System.out.println("getFromLinkedEnd: " + (endTime - startTime)  + "ns");
    }
    private void addToArrayBeginning() {
        arrayList.add(0, SAMPLE_TEXT);
    }
    private void addToLinkedBeginning() {
        linkedList.add(0, SAMPLE_TEXT);
    }
    private void addToArrayMiddle() {
        arrayList.add(arrayList.size()/2, SAMPLE_TEXT);
    }
    private void addToLinkedMiddle() {
        linkedList.add(linkedList.size()/2, SAMPLE_TEXT);
    }
    private void addToArrayEnd() {
        arrayList.add(SAMPLE_TEXT);
    }
    private void addToLinkedEnd() {
        linkedList.add(SAMPLE_TEXT);
    }

    private void removeFromArrayBeginning() {
        arrayList.remove(0);
    }
    private void removeFromLinkedBeginning() {
        linkedList.remove(0);
    }
    private void removeFromArrayMiddle() {
        arrayList.remove(arrayList.size()/2);
    }
    private void removeFromLinkedMiddle() {
        linkedList.remove(linkedList.size()/2);
    }
    private void removeFromArrayEnd() {
        arrayList.remove(arrayList.size() - 1);
    }
    private void removeFromLinkedEnd() {
        linkedList.remove(linkedList.size() - 1);
    }
    private String getFromArrayBeginning() {
        return arrayList.get(0);
    }
    private String getFromLinkedBeginning() {
        return linkedList.get(0);
    }
    private String getFromArrayMiddle() {
        return arrayList.get(arrayList.size()/2);
    }
    private String getFromLinkedMiddle() {
        return linkedList.get(linkedList.size()/2);
    }
    private String getFromArrayEnd() {
        return arrayList.get(arrayList.size() - 1);
    }
    private String getFromLinkedEnd() {
        return  linkedList.get(linkedList.size() - 1);
    }

}
