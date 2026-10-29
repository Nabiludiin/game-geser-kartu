package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.measurement.internal.w6;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3.o;
import t4.h0;
import t4.t;

/* compiled from: MyApplication */
@Deprecated
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f21823b;

    /* renamed from: a, reason: collision with root package name */
    private final c f21824a;

    /* compiled from: MyApplication */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            o.m(bundle);
            this.mAppId = (String) t.b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) t.b(bundle, "origin", String.class, null);
            this.mName = (String) t.b(bundle, "name", String.class, null);
            this.mValue = t.b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) t.b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) t.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) t.b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) t.b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) t.b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) t.b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) t.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) t.b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) t.b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) t.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) t.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) t.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(w6 w6Var) {
        this.f21824a = new a(w6Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f21823b == null) {
            synchronized (AppMeasurement.class) {
                if (f21823b == null) {
                    h0 h0Var = (h0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (h0Var != null) {
                        f21823b = new AppMeasurement(h0Var);
                    } else {
                        f21823b = new AppMeasurement(w6.O(context, new h2(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f21823b;
    }

    public void beginAdUnitExposure(String str) {
        this.f21824a.n0(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f21824a.b(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f21824a.H0(str);
    }

    public long generateEventId() {
        return this.f21824a.k();
    }

    public String getAppInstanceId() {
        return this.f21824a.i();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List c8 = this.f21824a.c(str, str2);
        ArrayList arrayList = new ArrayList(c8 == null ? 0 : c8.size());
        Iterator it = c8.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f21824a.j();
    }

    public String getCurrentScreenName() {
        return this.f21824a.g();
    }

    public String getGmpAppId() {
        return this.f21824a.l();
    }

    public int getMaxUserProperties(String str) {
        return this.f21824a.D0(str);
    }

    protected Map<String, Object> getUserProperties(String str, String str2, boolean z7) {
        return this.f21824a.d(str, str2, z7);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f21824a.a(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        o.m(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            t.a(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        c cVar = this.f21824a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.X(bundle);
    }

    public AppMeasurement(h0 h0Var) {
        this.f21824a = new b(h0Var);
    }
}
