package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.u1 {

    /* renamed from: q, reason: collision with root package name */
    w6 f21831q = null;

    /* renamed from: r, reason: collision with root package name */
    private final Map f21832r = new r.a();

    private final void O(com.google.android.gms.internal.measurement.y1 y1Var, String str) {
        b();
        this.f21831q.C().a0(y1Var, str);
    }

    private final void b() {
        if (this.f21831q == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void beginAdUnitExposure(String str, long j7) {
        b();
        this.f21831q.M().i(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        b();
        this.f21831q.B().O(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void clearMeasurementEnabled(long j7) {
        b();
        this.f21831q.B().n0(null);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void endAdUnitExposure(String str, long j7) {
        b();
        this.f21831q.M().j(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void generateEventId(com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        long p02 = this.f21831q.C().p0();
        b();
        this.f21831q.C().b0(y1Var, p02);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getAppInstanceId(com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        this.f21831q.b().t(new t6(this, y1Var));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        O(y1Var, this.f21831q.B().D());
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        this.f21831q.b().t(new ja(this, y1Var, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        O(y1Var, this.f21831q.B().R());
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        O(y1Var, this.f21831q.B().Q());
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getGmpAppId(com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        O(y1Var, this.f21831q.B().S());
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        this.f21831q.B().L(str);
        b();
        this.f21831q.C().c0(y1Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getSessionId(com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        w9 B = this.f21831q.B();
        B.f22928a.b().t(new z8(B, y1Var));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getTestFlag(com.google.android.gms.internal.measurement.y1 y1Var, int i7) {
        b();
        if (i7 == 0) {
            this.f21831q.C().a0(y1Var, this.f21831q.B().j0());
            return;
        }
        if (i7 == 1) {
            this.f21831q.C().b0(y1Var, this.f21831q.B().k0().longValue());
            return;
        }
        if (i7 != 2) {
            if (i7 == 3) {
                this.f21831q.C().c0(y1Var, this.f21831q.B().l0().intValue());
                return;
            } else {
                if (i7 != 4) {
                    return;
                }
                this.f21831q.C().e0(y1Var, this.f21831q.B().i0().booleanValue());
                return;
            }
        }
        yd C = this.f21831q.C();
        double doubleValue = this.f21831q.B().m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            y1Var.P0(bundle);
        } catch (RemoteException e8) {
            C.f22928a.a().r().b("Error returning double value to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getUserProperties(String str, String str2, boolean z7, com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        this.f21831q.b().t(new n8(this, y1Var, str, str2, z7));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void initForTests(Map map) {
        b();
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void initialize(w3.a aVar, com.google.android.gms.internal.measurement.h2 h2Var, long j7) {
        w6 w6Var = this.f21831q;
        if (w6Var == null) {
            this.f21831q = w6.O((Context) p3.o.m((Context) w3.b.r0(aVar)), h2Var, Long.valueOf(j7));
        } else {
            w6Var.a().r().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.y1 y1Var) {
        b();
        this.f21831q.b().t(new jb(this, y1Var));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) {
        b();
        this.f21831q.B().q(str, str2, bundle, z7, z8, j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.y1 y1Var, long j7) {
        b();
        p3.o.g(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f21831q.b().t(new u7(this, y1Var, new g0(str2, new e0(bundle), "app", j7), str));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void logHealthData(int i7, String str, w3.a aVar, w3.a aVar2, w3.a aVar3) {
        b();
        this.f21831q.a().y(i7, true, false, str, aVar == null ? null : w3.b.r0(aVar), aVar2 == null ? null : w3.b.r0(aVar2), aVar3 != null ? w3.b.r0(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityCreated(w3.a aVar, Bundle bundle, long j7) {
        b();
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.j2.M0((Activity) p3.o.m((Activity) w3.b.r0(aVar))), bundle, j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.j2 j2Var, Bundle bundle, long j7) {
        b();
        k9 k9Var = this.f21831q.B().f22797c;
        if (k9Var != null) {
            this.f21831q.B().h0();
            k9Var.e(j2Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityDestroyed(w3.a aVar, long j7) {
        b();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.j2.M0((Activity) p3.o.m((Activity) w3.b.r0(aVar))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.j2 j2Var, long j7) {
        b();
        k9 k9Var = this.f21831q.B().f22797c;
        if (k9Var != null) {
            this.f21831q.B().h0();
            k9Var.b(j2Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityPaused(w3.a aVar, long j7) {
        b();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.j2.M0((Activity) p3.o.m((Activity) w3.b.r0(aVar))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.j2 j2Var, long j7) {
        b();
        k9 k9Var = this.f21831q.B().f22797c;
        if (k9Var != null) {
            this.f21831q.B().h0();
            k9Var.a(j2Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityResumed(w3.a aVar, long j7) {
        b();
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.j2.M0((Activity) p3.o.m((Activity) w3.b.r0(aVar))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.j2 j2Var, long j7) {
        b();
        k9 k9Var = this.f21831q.B().f22797c;
        if (k9Var != null) {
            this.f21831q.B().h0();
            k9Var.d(j2Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivitySaveInstanceState(w3.a aVar, com.google.android.gms.internal.measurement.y1 y1Var, long j7) {
        b();
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.j2.M0((Activity) p3.o.m((Activity) w3.b.r0(aVar))), y1Var, j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.j2 j2Var, com.google.android.gms.internal.measurement.y1 y1Var, long j7) {
        b();
        k9 k9Var = this.f21831q.B().f22797c;
        Bundle bundle = new Bundle();
        if (k9Var != null) {
            this.f21831q.B().h0();
            k9Var.c(j2Var, bundle);
        }
        try {
            y1Var.P0(bundle);
        } catch (RemoteException e8) {
            this.f21831q.a().r().b("Error returning bundle value to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityStarted(w3.a aVar, long j7) {
        b();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.j2.M0((Activity) p3.o.m((Activity) w3.b.r0(aVar))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.j2 j2Var, long j7) {
        b();
        if (this.f21831q.B().f22797c != null) {
            this.f21831q.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityStopped(w3.a aVar, long j7) {
        b();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.j2.M0((Activity) p3.o.m((Activity) w3.b.r0(aVar))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.j2 j2Var, long j7) {
        b();
        if (this.f21831q.B().f22797c != null) {
            this.f21831q.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.y1 y1Var, long j7) {
        b();
        y1Var.P0(null);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.e2 e2Var) {
        t4.a0 a0Var;
        b();
        Map map = this.f21832r;
        synchronized (map) {
            try {
                a0Var = (t4.a0) map.get(Integer.valueOf(e2Var.e()));
                if (a0Var == null) {
                    a0Var = new zd(this, e2Var);
                    map.put(Integer.valueOf(e2Var.e()), a0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21831q.B().J(a0Var);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void resetAnalyticsData(long j7) {
        b();
        this.f21831q.B().G(j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.b2 b2Var) {
        b();
        this.f21831q.B().r0(new Runnable() { // from class: com.google.android.gms.measurement.internal.jc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    b2Var.c();
                } catch (RemoteException e8) {
                    ((w6) p3.o.m(AppMeasurementDynamiteService.this.f21831q)).a().r().b("Failed to call IDynamiteUploadBatchesCallback", e8);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setConditionalUserProperty(Bundle bundle, long j7) {
        b();
        if (bundle == null) {
            this.f21831q.a().o().a("Conditional user property must not be null");
        } else {
            this.f21831q.B().N(bundle, j7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setConsentThirdParty(Bundle bundle, long j7) {
        b();
        this.f21831q.B().o0(bundle, -20, j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setCurrentScreen(w3.a aVar, String str, String str2, long j7) {
        b();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.j2.M0((Activity) p3.o.m((Activity) w3.b.r0(aVar))), str, str2, j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.j2 j2Var, String str, String str2, long j7) {
        b();
        this.f21831q.I().t(j2Var, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setDataCollectionEnabled(boolean z7) {
        b();
        w9 B = this.f21831q.B();
        B.j();
        B.f22928a.b().t(new l8(B, z7));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setDefaultEventParameters(Bundle bundle) {
        b();
        final w9 B = this.f21831q.B();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        B.f22928a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.s9
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                w9.this.U(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setEventInterceptor(com.google.android.gms.internal.measurement.e2 e2Var) {
        b();
        id idVar = new id(this, e2Var);
        if (this.f21831q.b().p()) {
            this.f21831q.B().I(idVar);
        } else {
            this.f21831q.b().t(new m9(this, idVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.g2 g2Var) {
        b();
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setMeasurementEnabled(boolean z7, long j7) {
        b();
        this.f21831q.B().n0(Boolean.valueOf(z7));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setMinimumSessionDuration(long j7) {
        b();
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setSessionTimeoutDuration(long j7) {
        b();
        w9 B = this.f21831q.B();
        B.f22928a.b().t(new o8(B, j7));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setSgtmDebugInfo(Intent intent) {
        b();
        w9 B = this.f21831q.B();
        Uri data = intent.getData();
        if (data == null) {
            B.f22928a.a().u().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            w6 w6Var = B.f22928a;
            w6Var.a().u().a("[sgtm] Preview Mode was not enabled.");
            w6Var.w().Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            w6 w6Var2 = B.f22928a;
            w6Var2.a().u().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            w6Var2.w().Q(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setUserId(final String str, long j7) {
        b();
        final w9 B = this.f21831q.B();
        if (str != null && TextUtils.isEmpty(str)) {
            B.f22928a.a().r().a("User ID must be non-empty or null");
        } else {
            B.f22928a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.t9
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    w6 w6Var = w9.this.f22928a;
                    if (w6Var.L().x(str)) {
                        w6Var.L().p();
                    }
                }
            });
            B.z(null, "_id", str, true, j7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setUserProperty(String str, String str2, w3.a aVar, boolean z7, long j7) {
        b();
        this.f21831q.B().z(str, str2, w3.b.r0(aVar), z7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.e2 e2Var) {
        t4.a0 a0Var;
        b();
        Map map = this.f21832r;
        synchronized (map) {
            a0Var = (t4.a0) map.remove(Integer.valueOf(e2Var.e()));
        }
        if (a0Var == null) {
            a0Var = new zd(this, e2Var);
        }
        this.f21831q.B().K(a0Var);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setConsent(Bundle bundle, long j7) {
    }
}
