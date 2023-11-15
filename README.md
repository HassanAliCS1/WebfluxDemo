# WebfluxDemo
learning about webflux 

This code had two tests 
to understand the concept of mono and flux 

A Mono object represents a single or empty value. This means it can emit only one value at most for the onNext() request and then terminates with the onComplete() signal. In case of failure, it only emits a single onError() signal.

Flux is a standard Publisher that represents 0 to N asynchronous sequence values. This means that it can emit 0 to many values, possibly infinite values for onNext() requests, and then terminates with either a completion or an error signal.
