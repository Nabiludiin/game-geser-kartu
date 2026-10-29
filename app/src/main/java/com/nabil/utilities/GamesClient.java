package com.nabil.utilities;

import android.app.Activity;
import com.google.android.gms.games.PlayGames;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.games.AuthenticationResult;

/**
 * Pengganti GoogleApiClient (Play Games v1) dengan Play Games Services v2.
 * Bentuknya sengaja kecil: hanya fungsi yang dipakai activity dan t1.a.
 */
public class GamesClient {

    public interface Callbacks {
        void onSignedIn();

        void onSignInFailed();
    }

    private final Activity activity;
    private final Callbacks callbacks;
    private boolean signedIn;

    public GamesClient(Activity activity, Callbacks callbacks) {
        this.activity = activity;
        this.callbacks = callbacks;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    /** Cek status login tanpa menampilkan UI (v2 login otomatis saat app dibuka). */
    public void connect() {
        handle(PlayGames.getGamesSignInClient(activity).isAuthenticated());
    }

    /** Login manual, dipakai saat pemain menekan tombol Play Games. */
    public void signIn() {
        handle(PlayGames.getGamesSignInClient(activity).signIn());
    }

    private void handle(Task<AuthenticationResult> task) {
        task.addOnCompleteListener(t -> {
            signedIn = t.isSuccessful() && t.getResult().isAuthenticated();
            if (callbacks == null) {
                return;
            }
            if (signedIn) {
                callbacks.onSignedIn();
            } else {
                callbacks.onSignInFailed();
            }
        });
    }

    public void unlockAchievement(String id, Runnable onUnlocked) {
        if (!signedIn) {
            return;
        }
        PlayGames.getAchievementsClient(activity).unlockImmediate(id)
                .addOnSuccessListener(unused -> onUnlocked.run());
    }

    public void submitScore(String leaderboardId, long score) {
        if (signedIn) {
            PlayGames.getLeaderboardsClient(activity).submitScore(leaderboardId, score);
        }
    }

    public void showLeaderboard(String leaderboardId, int requestCode) {
        PlayGames.getLeaderboardsClient(activity).getLeaderboardIntent(leaderboardId)
                .addOnSuccessListener(intent -> activity.startActivityForResult(intent, requestCode));
    }

    public void showAchievements(int requestCode) {
        PlayGames.getAchievementsClient(activity).getAchievementsIntent()
                .addOnSuccessListener(intent -> activity.startActivityForResult(intent, requestCode));
    }
}
