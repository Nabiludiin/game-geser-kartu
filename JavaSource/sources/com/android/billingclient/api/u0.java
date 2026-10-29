package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.d6;
import com.google.android.gms.internal.play_billing.l6;
import com.google.android.gms.internal.play_billing.s6;
import com.google.android.gms.internal.play_billing.t3;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class u0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4056a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4057b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v0 f4058c;

    u0(v0 v0Var, boolean z7) {
        Objects.requireNonNull(v0Var);
        this.f4058c = v0Var;
        this.f4057b = z7;
    }

    private final void d(Bundle bundle, d dVar, int i7, s6 s6Var, long j7, boolean z7) {
        m0 m0Var;
        m0 m0Var2;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                m0Var2 = this.f4058c.f4063c;
                m0Var2.g(d6.B(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), t3.a()), j7, z7);
            } else {
                m0Var = this.f4058c.f4063c;
                m0Var.g(l0.b(l6.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i7, dVar, null, s6Var), j7, z7);
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.q0.l("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f4056a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f4057b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f4056a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        u0 u0Var;
        try {
            try {
                if (this.f4056a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    u0Var = this;
                    context.registerReceiver(u0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f4057b ? 4 : 2);
                } else {
                    u0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                u0Var.f4056a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f4056a) {
            com.google.android.gms.internal.play_billing.q0.l("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f4056a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        s6 s6Var;
        int i7;
        int i8;
        d g8;
        p1.i iVar;
        m0 m0Var;
        m0 m0Var2;
        p1.i iVar2;
        p1.i iVar3;
        int intValue;
        m0 m0Var3;
        p1.i iVar4;
        p1.i iVar5;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                s6Var = s6.PURCHASES_UPDATED_ACTION;
            }
            s6Var = s6.BROADCAST_ACTION_UNSPECIFIED;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                s6Var = s6.ALTERNATIVE_BILLING_ACTION;
            }
            s6Var = s6.BROADCAST_ACTION_UNSPECIFIED;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                s6Var = s6.LOCAL_PURCHASES_UPDATED_ACTION;
            }
            s6Var = s6.BROADCAST_ACTION_UNSPECIFIED;
        }
        s6 s6Var2 = s6Var;
        s6 s6Var3 = s6.LOCAL_PURCHASES_UPDATED_ACTION;
        if (s6Var2.equals(s6Var3) || s6Var2.equals(s6.ALTERNATIVE_BILLING_ACTION)) {
            i7 = 2;
            i8 = 2;
        } else {
            i8 = s6Var2.equals(s6.PURCHASES_UPDATED_ACTION) ? 32 : 1;
            i7 = 2;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.q0.l("BillingBroadcastManager", "Bundle is null.");
            v0 v0Var = this.f4058c;
            m0Var3 = v0Var.f4063c;
            l6 l6Var = l6.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            d dVar = n0.f4015h;
            m0Var3.b(l0.b(l6Var, i8, dVar, null, s6Var2));
            iVar4 = v0Var.f4062b;
            if (iVar4 != null) {
                iVar5 = v0Var.f4062b;
                iVar5.a(dVar, null);
            }
        } else {
            if (i8 == i7) {
                int i9 = com.google.android.gms.internal.play_billing.q0.f21711a;
                d.a d8 = d.d();
                d8.d(com.google.android.gms.internal.play_billing.q0.b(intent.getExtras(), "BillingBroadcastManager"));
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    com.google.android.gms.internal.play_billing.q0.l("BillingBroadcastManager", "Unexpected null bundle received!");
                } else {
                    Object obj = extras2.get("SUB_RESPONSE_CODE");
                    if (obj == null) {
                        com.google.android.gms.internal.play_billing.q0.k("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                    } else if (obj instanceof Integer) {
                        intValue = ((Integer) obj).intValue();
                        d8.c(intValue);
                        d8.b(com.google.android.gms.internal.play_billing.q0.h(intent.getExtras(), "BillingBroadcastManager"));
                        g8 = d8.a();
                    } else {
                        com.google.android.gms.internal.play_billing.q0.l("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                    }
                }
                intValue = 0;
                d8.c(intValue);
                d8.b(com.google.android.gms.internal.play_billing.q0.h(intent.getExtras(), "BillingBroadcastManager"));
                g8 = d8.a();
            } else {
                g8 = com.google.android.gms.internal.play_billing.q0.g(intent, "BillingBroadcastManager");
            }
            long j7 = extras.getLong("billingClientTransactionId", 0L);
            boolean z7 = extras.getBoolean("wasServiceAutoReconnected", false);
            if (s6Var2.equals(s6.PURCHASES_UPDATED_ACTION) || s6Var2.equals(s6Var3)) {
                d dVar2 = g8;
                List j8 = com.google.android.gms.internal.play_billing.q0.j(extras);
                if (dVar2.c() == 0) {
                    m0Var = this.f4058c.f4063c;
                    m0Var.f(l0.c(i8, s6Var2), j7, z7);
                } else {
                    d(extras, dVar2, i8, s6Var2, j7, z7);
                }
                iVar = this.f4058c.f4062b;
                iVar.a(dVar2, j8);
                return;
            }
            if (s6Var2.equals(s6.ALTERNATIVE_BILLING_ACTION)) {
                if (g8.c() != 0) {
                    d dVar3 = g8;
                    d(extras, dVar3, i8, s6Var2, j7, z7);
                    iVar3 = this.f4058c.f4062b;
                    iVar3.a(dVar3, com.google.android.gms.internal.play_billing.j0.n());
                    return;
                }
                v0 v0Var2 = this.f4058c;
                v0.a(v0Var2);
                v0.e(v0Var2);
                com.google.android.gms.internal.play_billing.q0.l("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                v0 v0Var3 = this.f4058c;
                m0Var2 = v0Var3.f4063c;
                l6 l6Var2 = l6.MISSING_USER_CHOICE_BILLING_LISTENER;
                d dVar4 = n0.f4015h;
                m0Var2.g(l0.b(l6Var2, i8, dVar4, null, s6Var2), j7, z7);
                iVar2 = v0Var3.f4062b;
                iVar2.a(dVar4, com.google.android.gms.internal.play_billing.j0.n());
            }
        }
    }
}
