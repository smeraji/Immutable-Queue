/*
  Worksapp Assignment 2: 
  Name: Harshit Chopra
  Enrollment Number:12117027
  Branch: Mech
  College: IIT Roorkee
*/


package jp.co.worksap.global;
import java.util.*;

public class ImmutableQueue<E> {
 private Object[] queue;
 
 //Default constructor
 public ImmutableQueue() {
 }
 
 //Overloaded Constructor for when size is given
 private ImmutableQueue(int queueSize) {
  queue = new Object[queueSize];
 }
 
 //Add an element at the end of queue in another queue
 public ImmutableQueue<E> enqueue(E e) {
  if (e == null) {
   throw new IllegalArgumentException();
  }
  ImmutableQueue<E> queue2 = new ImmutableQueue<E>(size() + 1);
  if (size() > 0) {
   for (int i = 0; i < size(); i++) {
    queue2.queue[i] = queue[i];
   }
  }
  queue2.queue[size()] = e;
  return queue2;
 }
 
 //Remove first element of queue in another queue
 public ImmutableQueue<E> dequeue() {
  if (size() ==0)
  { 
    throw new NoSuchElementException();
  }
  //Create queue2 with size equal to queue
  ImmutableQueue<E> queue2 = new ImmutableQueue<E>(size() - 1);
  for (int i = 1; i < size(); i++) {
   queue2.queue[i - 1] = queue[i];
  }
  return queue2;
 }
 
 //Get first element of queue
 public E peek() {
  if (size()==0) throw new NoSuchElementException();
  return (E) queue[0];
 }
 
 //get size of queue
 public int size() {
  if(queue != null) return queue.length;
  else return 0;
 }
}
