package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.p3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3.o;
import t4.h0;
import w4.l;

/* compiled from: MyApplication */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f22947b;

    /* renamed from: a, reason: collision with root package name */
    private final p3 f22948a;

    /* compiled from: MyApplication */
    public enum a {
        GRANTED,
        DENIED
    }

    /* compiled from: MyApplication */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(p3 p3Var) {
        o.m(p3Var);
        this.f22948a = p3Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f22947b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f22947b == null) {
                        f22947b = new FirebaseAnalytics(p3.o(context, null));
                    }
                } finally {
                }
            }
        }
        return f22947b;
    }

    public static h0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        p3 o7 = p3.o(context, bundle);
        if (o7 == null) {
            return null;
        }
        return new com.google.firebase.analytics.a(o7);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) l.b(com.google.firebase.installations.b.l().k(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw new IllegalStateException(e8);
        } catch (ExecutionException e9) {
            throw new IllegalStateException(e9.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f22948a.v(j2.M0(activity), str, str2);
    }
}
