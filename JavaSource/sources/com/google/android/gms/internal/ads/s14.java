package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: MyApplication */
public class s14 extends zm3 {

    /* renamed from: r, reason: collision with root package name */
    public final int f15431r;

    public s14(cq3 cq3Var, int i7, int i8) {
        super(b(2008, 1));
        this.f15431r = 1;
    }

    public static s14 a(IOException iOException, cq3 cq3Var, int i7) {
        String message = iOException.getMessage();
        int i8 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zw3.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i8 == 2007 ? new q04(iOException, cq3Var) : new s14(iOException, cq3Var, i8, i7);
    }

    private static int b(int i7, int i8) {
        return i7 == 2000 ? i8 != 1 ? 2000 : 2001 : i7;
    }

    public s14(IOException iOException, cq3 cq3Var, int i7, int i8) {
        super(iOException, b(i7, i8));
        this.f15431r = i8;
    }

    public s14(String str, cq3 cq3Var, int i7, int i8) {
        super(str, b(i7, i8));
        this.f15431r = i8;
    }

    public s14(String str, IOException iOException, cq3 cq3Var, int i7, int i8) {
        super(str, iOException, b(i7, i8));
        this.f15431r = i8;
    }
}
