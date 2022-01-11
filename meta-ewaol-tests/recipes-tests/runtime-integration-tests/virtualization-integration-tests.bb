# Copyright (c) 2021-2022, Arm Limited.
#
# SPDX-License-Identifier: MIT

SUMMARY = "Virtualization integration tests."
DESCRIPTION = "Integration tests for the Xen hypervisor. \
               Tests may be run standalone via \
               run-virtualization-integration-tests, or via the ptest \
               framework using ptest-runner."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit features_check
REQUIRED_DISTRO_FEATURES += "ewaol-virtualization"

TEST_SUITE_NAME = "virtualization-integration-tests"
TEST_SUITE_PREFIX = "VIRT"

TEST_FILES = "file://virtualization-integration-tests.bats \
              file://virtualization-funcs.sh \
              file://virtual-guest-funcs.expect \
              file://guest-run-command.expect \
              file://integration-tests-common-funcs.sh"

SRC_URI = "${TEST_FILES} \
           file://run-test-suite \
           file://run-ptest"

require runtime-integration-tests.inc

RDEPENDS:${PN} += "expect"