(function () {
    var url = "video/ocine_daniel_manifest.mpd";
    var player = dashjs.MediaPlayer().create();
    player.initialize(document.querySelector("#videoPlayer"), url, true);
})();