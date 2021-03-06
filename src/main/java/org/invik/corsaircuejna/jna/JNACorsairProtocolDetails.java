package org.invik.corsaircuejna.jna;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * contains information about SDK and CUE versions<br>
 * <i>native declaration : include\CUESDK.h:105</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("CorsairCUEJNAWrapper.x64_2013")
public class JNACorsairProtocolDetails extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * null - terminated string containing version of SDK(like \u00e2\u20ac\u01531.0.0.1\u00e2\u20ac\ufffd). Always contains valid value even if there was no CUE found<br>
	 * C type : const char*
	 */
	@Field(0) 
	public Pointer<Byte > sdkVersion() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * null - terminated string containing version of SDK(like \u00e2\u20ac\u01531.0.0.1\u00e2\u20ac\ufffd). Always contains valid value even if there was no CUE found<br>
	 * C type : const char*
	 */
	@Field(0) 
	public JNACorsairProtocolDetails sdkVersion(Pointer<Byte > sdkVersion) {
		this.io.setPointerField(this, 0, sdkVersion);
		return this;
	}
	/**
	 * null - terminated string containing version of CUE(like \u00e2\u20ac\u01531.0.0.1\u00e2\u20ac\ufffd) or NULL if CUE was not found.<br>
	 * C type : const char*
	 */
	@Field(1) 
	public Pointer<Byte > serverVersion() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * null - terminated string containing version of CUE(like \u00e2\u20ac\u01531.0.0.1\u00e2\u20ac\ufffd) or NULL if CUE was not found.<br>
	 * C type : const char*
	 */
	@Field(1) 
	public JNACorsairProtocolDetails serverVersion(Pointer<Byte > serverVersion) {
		this.io.setPointerField(this, 1, serverVersion);
		return this;
	}
	/** integer number that specifies version of protocol that is implemented by current SDK. Numbering starts from 1. Always contains valid value even if there was no CUE found */
	@Field(2) 
	public int sdkProtocolVersion() {
		return this.io.getIntField(this, 2);
	}
	/** integer number that specifies version of protocol that is implemented by current SDK. Numbering starts from 1. Always contains valid value even if there was no CUE found */
	@Field(2) 
	public JNACorsairProtocolDetails sdkProtocolVersion(int sdkProtocolVersion) {
		this.io.setIntField(this, 2, sdkProtocolVersion);
		return this;
	}
	/** integer number that specifies version of protocol that is implemented by CUE. Numbering starts from 1. If CUE was not found then this value will be 0 */
	@Field(3) 
	public int serverProtocolVersion() {
		return this.io.getIntField(this, 3);
	}
	/** integer number that specifies version of protocol that is implemented by CUE. Numbering starts from 1. If CUE was not found then this value will be 0 */
	@Field(3) 
	public JNACorsairProtocolDetails serverProtocolVersion(int serverProtocolVersion) {
		this.io.setIntField(this, 3, serverProtocolVersion);
		return this;
	}
	/** boolean value that specifies if there were breaking changes between version of protocol implemented by server and client */
	@Field(4) 
	public boolean breakingChanges() {
		return this.io.getBooleanField(this, 4);
	}
	/** boolean value that specifies if there were breaking changes between version of protocol implemented by server and client */
	@Field(4) 
	public JNACorsairProtocolDetails breakingChanges(boolean breakingChanges) {
		this.io.setBooleanField(this, 4, breakingChanges);
		return this;
	}
	public JNACorsairProtocolDetails() {
		super();
	}
	public JNACorsairProtocolDetails(Pointer pointer) {
		super(pointer);
	}
}
