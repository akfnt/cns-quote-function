package com.akfnt.cnsquotefunction.domain;

public record Quote(
        String content,
        String author,
        Genre genre
) {
}
