package com.google.firebase.installations;

import c5.k;

/* compiled from: MyApplication */
public class c extends k {

    /* renamed from: q, reason: collision with root package name */
    private final a f23031q;

    /* compiled from: MyApplication */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public c(a aVar) {
        this.f23031q = aVar;
    }

    public c(String str, a aVar) {
        super(str);
        this.f23031q = aVar;
    }
}
