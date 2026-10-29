package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: MyApplication */
public final class dk3 {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f7146a;

    public dk3(ExecutorService executorService) {
        this.f7146a = executorService;
    }

    public final sj3 a(File file, v05 v05Var, Function function) {
        return new ck3(file, this.f7146a, new zj3(v05Var), function);
    }

    public final sj3 b(File file, byte[] bArr, Function function) {
        return new ck3(file, this.f7146a, new vj3(bArr), function);
    }
}
