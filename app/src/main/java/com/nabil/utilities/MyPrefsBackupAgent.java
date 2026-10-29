package com.nabil.utilities;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

public class MyPrefsBackupAgent extends BackupAgentHelper {
    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        addHelper("MyPrefsKey", new SharedPreferencesBackupHelper(this, "SharedPref", "com.nabil_preferences"));
    }
}
