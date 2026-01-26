package com.chatlogparser;

//Generic interface to filter messages
public interface MessageFilter<T> {
 boolean filter(T message);
}

