package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: MyApplication */
public interface v1 extends IInterface {
    void beginAdUnitExposure(String str, long j7);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j7);

    void endAdUnitExposure(String str, long j7);

    void generateEventId(y1 y1Var);

    void getAppInstanceId(y1 y1Var);

    void getCachedAppInstanceId(y1 y1Var);

    void getConditionalUserProperties(String str, String str2, y1 y1Var);

    void getCurrentScreenClass(y1 y1Var);

    void getCurrentScreenName(y1 y1Var);

    void getGmpAppId(y1 y1Var);

    void getMaxUserProperties(String str, y1 y1Var);

    void getSessionId(y1 y1Var);

    void getTestFlag(y1 y1Var, int i7);

    void getUserProperties(String str, String str2, boolean z7, y1 y1Var);

    void initForTests(Map map);

    void initialize(w3.a aVar, h2 h2Var, long j7);

    void isDataCollectionEnabled(y1 y1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7);

    void logEventAndBundle(String str, String str2, Bundle bundle, y1 y1Var, long j7);

    void logHealthData(int i7, String str, w3.a aVar, w3.a aVar2, w3.a aVar3);

    void onActivityCreated(w3.a aVar, Bundle bundle, long j7);

    void onActivityCreatedByScionActivityInfo(j2 j2Var, Bundle bundle, long j7);

    void onActivityDestroyed(w3.a aVar, long j7);

    void onActivityDestroyedByScionActivityInfo(j2 j2Var, long j7);

    void onActivityPaused(w3.a aVar, long j7);

    void onActivityPausedByScionActivityInfo(j2 j2Var, long j7);

    void onActivityResumed(w3.a aVar, long j7);

    void onActivityResumedByScionActivityInfo(j2 j2Var, long j7);

    void onActivitySaveInstanceState(w3.a aVar, y1 y1Var, long j7);

    void onActivitySaveInstanceStateByScionActivityInfo(j2 j2Var, y1 y1Var, long j7);

    void onActivityStarted(w3.a aVar, long j7);

    void onActivityStartedByScionActivityInfo(j2 j2Var, long j7);

    void onActivityStopped(w3.a aVar, long j7);

    void onActivityStoppedByScionActivityInfo(j2 j2Var, long j7);

    void performAction(Bundle bundle, y1 y1Var, long j7);

    void registerOnMeasurementEventListener(e2 e2Var);

    void resetAnalyticsData(long j7);

    void retrieveAndUploadBatches(b2 b2Var);

    void setConditionalUserProperty(Bundle bundle, long j7);

    void setConsent(Bundle bundle, long j7);

    void setConsentThirdParty(Bundle bundle, long j7);

    void setCurrentScreen(w3.a aVar, String str, String str2, long j7);

    void setCurrentScreenByScionActivityInfo(j2 j2Var, String str, String str2, long j7);

    void setDataCollectionEnabled(boolean z7);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(e2 e2Var);

    void setInstanceIdProvider(g2 g2Var);

    void setMeasurementEnabled(boolean z7, long j7);

    void setMinimumSessionDuration(long j7);

    void setSessionTimeoutDuration(long j7);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j7);

    void setUserProperty(String str, String str2, w3.a aVar, boolean z7, long j7);

    void unregisterOnMeasurementEventListener(e2 e2Var);
}
