package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.e;
import com.google.android.gms.internal.play_billing.l6;

/* compiled from: MyApplication */
public class ProxyBillingActivityV2 extends ComponentActivity {
    private androidx.activity.result.c A;
    private androidx.activity.result.c B;
    private androidx.activity.result.c C;
    private ResultReceiver D;
    private ResultReceiver E;
    private ResultReceiver F;

    final void C(androidx.activity.result.a aVar) {
        Intent a8 = aVar.a();
        int c8 = com.google.android.gms.internal.play_billing.q0.g(a8, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.D;
        if (resultReceiver != null) {
            resultReceiver.send(c8, a8 == null ? null : a8.getExtras());
        }
        if (aVar.f() != -1 || c8 != 0) {
            com.google.android.gms.internal.play_billing.q0.l("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.f() + " and billing's responseCode: " + c8);
        }
        finish();
    }

    final void D(androidx.activity.result.a aVar) {
        Intent a8 = aVar.a();
        int c8 = com.google.android.gms.internal.play_billing.q0.g(a8, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.E;
        if (resultReceiver != null) {
            resultReceiver.send(c8, a8 == null ? null : a8.getExtras());
        }
        if (aVar.f() != -1 || c8 != 0) {
            com.google.android.gms.internal.play_billing.q0.l("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.f()), Integer.valueOf(c8)));
        }
        finish();
    }

    final void E(androidx.activity.result.a aVar) {
        Intent a8 = aVar.a();
        Bundle extras = a8 == null ? null : a8.getExtras();
        if (aVar.f() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.q0.l("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", Integer.valueOf(aVar.f())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", l6.ERROR_IN_ACTIVITY_RESULT.a());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", Integer.valueOf(aVar.f())));
        }
        int c8 = com.google.android.gms.internal.play_billing.q0.g(a8, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.F;
        if (resultReceiver != null) {
            resultReceiver.send(c8, extras);
        } else {
            com.google.android.gms.internal.play_billing.q0.l("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (c8 != 0) {
            com.google.android.gms.internal.play_billing.q0.l("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(c8)));
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A = A(new e.d(), new androidx.activity.result.b() { // from class: com.android.billingclient.api.r0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ProxyBillingActivityV2.this.C((androidx.activity.result.a) obj);
            }
        });
        this.B = A(new e.d(), new androidx.activity.result.b() { // from class: com.android.billingclient.api.s0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ProxyBillingActivityV2.this.D((androidx.activity.result.a) obj);
            }
        });
        this.C = A(new e.d(), new androidx.activity.result.b() { // from class: com.android.billingclient.api.t0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ProxyBillingActivityV2.this.E((androidx.activity.result.a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.D = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.E = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.F = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.q0.k("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.D = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.A.a(new e.b(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.E = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.B.a(new e.b(pendingIntent2).a());
        } else if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.F = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.C.a(new e.b(pendingIntent3).a());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.D;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.E;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.F;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
