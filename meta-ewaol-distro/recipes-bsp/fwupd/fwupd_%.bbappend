# reduce build dependencies, we don't need this
PACKAGECONFIG:remove = "plugin_modem_manager"

# tpm, uefi support for ewaol
PACKAGECONFIG:append = " plugin_tpm plugin_uefi_pk plugin_uefi_capsule "
