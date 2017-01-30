#!/bin/bash

PATH=$PATH:$HOME/javacc-5.0/bin

mkdir -p gen

cp Ex1.jj gen

cd gen
javacc Ex1.jj

javac *.java
echo Compilation javac terminee

cd ..
