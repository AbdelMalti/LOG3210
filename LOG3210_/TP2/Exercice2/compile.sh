#!/bin/bash

PATH=$PATH:$HOME/javacc-5.0/bin

mkdir -p gen

cp Ex2.jj gen

cd gen
javacc Ex2.jj

javac *.java
echo Compilation javac terminee

cd ..
