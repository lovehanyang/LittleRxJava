package com.joy.rxjava.utils;

import android.support.annotation.Nullable;

/**
 * Created by joybar on 2018/5/14.
 */

public class CheckUtils {
	public static <T> T checkNotNull(T reference) {
		if (reference == null) {
			throw new NullPointerException();
		} else {
			return reference;
		}
	}

	public static <T> T checkNotNull(T reference, @Nullable Object errorMessage) {
		if (reference == null) {
			throw new NullPointerException(String.valueOf(errorMessage));
		} else {
			return reference;
		}
	}

}
