// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Finds values and indices of the {@code k} largest elements for the last dimension.
 * 
 *  If the input is a vector (rank-1), finds the {@code k} largest entries in the vector
 *  and outputs their values and indices as vectors.  Thus {@code values[j]} is the
 *  {@code j}-th largest entry in {@code input}, and its index is {@code indices[j]}.
 * 
 *  For matrices (resp. higher rank input), computes the top {@code k} entries in each
 *  row (resp. vector along the last dimension).  Thus,
 * 
 *      values.shape = indices.shape = input.shape[:-1] + [k]
 * 
 *  If two elements are equal, the lower-index element appears first.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 1-D or higher with last dimension at least {@code k}.
 *  * k: 0-D.  Number of top elements to look for along the last dimension (along each
 *  row for matrices).
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * sorted: If true the resulting {@code k} elements will be sorted by the values in
 *  descending order.
 * 
 *  Returns:
 *  * {@code Output} values: The {@code k} largest elements along each last dimensional slice.
 *  * {@code Output} indices: The indices of {@code values} within the last dimension of {@code input}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TopK extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TopK(Pointer p) { super(p); }

  /** Optional attribute setters for TopK */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** If true the resulting {@code k} elements will be sorted by the values in
     *  descending order.
     * 
     *  Defaults to true */
    public native @ByVal Attrs Sorted(@Cast("bool") boolean x);

    public native @Cast("bool") boolean sorted_(); public native Attrs sorted_(boolean setter);
  }
  public TopK(@Const @ByRef Scope scope, @ByVal Input input,
       @ByVal Input k) { super((Pointer)null); allocate(scope, input, k); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
       @ByVal Input k);
  public TopK(@Const @ByRef Scope scope, @ByVal Input input,
       @ByVal Input k, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, k, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
       @ByVal Input k, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Sorted(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native TopK operation(Operation setter);
  public native @ByRef Output values(); public native TopK values(Output setter);
  public native @ByRef Output indices(); public native TopK indices(Output setter);
}