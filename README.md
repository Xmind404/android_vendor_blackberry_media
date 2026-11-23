# BlackBerry KEY2 stock media for LineageOS 24.0 (athena)

Path in the tree: `vendor/blackberry/media`

- `audio/` – BlackBerry KEYone/KEY2 stock UI sounds, alarms, notifications
  and ringtones, installed to `/product/media/audio` by `media.mk`.
- `wallpapers/` – `BlackBerryWallpapers`, a partner customization package
  that exposes the stock wallpapers in Wallpaper & style.
- `bootanimation.zip` – boot animation used through `TARGET_BOOTANIMATION`.

The sounds, images and animation are BlackBerry stock assets; only the
build glue is Apache-2.0. `media.mk` must be inherited before the AOSP and
Lineage audio packages (first PRODUCT_COPY_FILES entry wins).
