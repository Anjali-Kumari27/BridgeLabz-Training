package com.annotations.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation runtime tak available rahegi
//important for reflection
@Retention(RetentionPolicy.RUNTIME)

// Annotation only applied on METHOD
@Target(ElementType.METHOD)

//@interface for custom annotation
public @interface TaskInfo {

    // Priority of the task (field of annotation)
    String priority();

    // Person assigned to the task
    String assignedTo();
}

