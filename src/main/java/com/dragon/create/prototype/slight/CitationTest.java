package com.dragon.create.prototype.slight;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation clone = citation.clone();

        citation.setName("Dragon");
        clone.setName("Dragon_clone");

        citation.show();
        clone.show();
    }
}
