package com.sanju.musicplayer.playback;

import android.app.Activity;
import android.media.MediaPlayer;

import com.sanju.musicplayer.MainActivity;
import com.sanju.musicplayer.models.Album;
import com.sanju.musicplayer.models.Song;

import java.util.List;

/**
 * Allows {@link MainActivity} to control media playback of {@link MediaPlayerHolder}.
 */
public interface PlayerAdapter {

    void initMediaPlayer();

    void release();

    boolean isMediaPlayer();

    boolean isPlaying();

    void resumeOrPause();

    void reset();

    boolean isReset();

    void instantReset();

    void skip(boolean isNext);

    void openEqualizer(Activity activity);

    void seekTo(int position);

    void setPlaybackInfoListener(PlaybackInfoListener playbackInfoListener);

    Song getCurrentSong();

    @PlaybackInfoListener.State
    int getState();

    int getPlayerPosition();

    void registerNotificationActionsReceiver(boolean isRegister);

    Album getSelectedAlbum();

    void setSelectedAlbum(Album album);

    void setCurrentSong(Song song, List<Song> songs);

    MediaPlayer getMediaPlayer();

    void onPauseActivity();

    void onResumeActivity();
}
