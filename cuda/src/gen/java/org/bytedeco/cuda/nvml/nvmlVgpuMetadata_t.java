// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/** \} */

/***************************************************************************************************/
/** \defgroup nvml vGPU Migration
 * This chapter describes NVML operations that are associated with vGPU Migration.
 *  \{
 */
/***************************************************************************************************/

/**
 * vGPU metadata structure.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuMetadata_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuMetadata_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuMetadata_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuMetadata_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuMetadata_t position(long position) {
        return (nvmlVgpuMetadata_t)super.position(position);
    }

    /** Current version of the structure */
    public native @Cast("unsigned int") int version(); public native nvmlVgpuMetadata_t version(int setter);
    /** Current revision of the structure */
    public native @Cast("unsigned int") int revision(); public native nvmlVgpuMetadata_t revision(int setter);
    /** Current state of Guest-dependent fields */
    public native @Cast("nvmlVgpuGuestInfoState_t") int guestInfoState(); public native nvmlVgpuMetadata_t guestInfoState(int setter);
    /** Version of driver installed in guest */
    public native @Cast("char") byte guestDriverVersion(int i); public native nvmlVgpuMetadata_t guestDriverVersion(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer guestDriverVersion();
    /** Version of driver installed in host */
    public native @Cast("char") byte hostDriverVersion(int i); public native nvmlVgpuMetadata_t hostDriverVersion(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer hostDriverVersion();
    /** Reserved for internal use */
    public native @Cast("unsigned int") int reserved(int i); public native nvmlVgpuMetadata_t reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    /** Size of opaque data field in bytes */
    public native @Cast("unsigned int") int opaqueDataSize(); public native nvmlVgpuMetadata_t opaqueDataSize(int setter);
    /** Opaque data */
    public native @Cast("char") byte opaqueData(int i); public native nvmlVgpuMetadata_t opaqueData(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer opaqueData();
}