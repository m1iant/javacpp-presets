// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;



/*-------------------------------------------------------------------------*
 *                    Basic rectangle and rectangle arrays                 *
 *-------------------------------------------------------------------------*/

/** Basic rectangle */
@Name("Box") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class BOX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BOX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BOX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BOX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BOX position(long position) {
        return (BOX)super.position(position);
    }

    /** left coordinate                   */
    public native @Cast("l_int32") int x(); public native BOX x(int setter);
    /** top coordinate                    */
    public native @Cast("l_int32") int y(); public native BOX y(int setter);
    /** box width                         */
    public native @Cast("l_int32") int w(); public native BOX w(int setter);
    /** box height                        */
    public native @Cast("l_int32") int h(); public native BOX h(int setter);
    /** reference count (1 if no clones)  */
    public native @Cast("l_uint32") int refcount(); public native BOX refcount(int setter);
}