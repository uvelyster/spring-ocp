#!/bin/bash


docker build -t gradlebuilder gradle_builder/

s2i build . gradlebuilder demoapp

