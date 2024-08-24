package io.project.task4;

import io.project.task4.exception.DivisionByZeroException;

interface Operation {
    double execute(double a, double b) throws DivisionByZeroException;
}