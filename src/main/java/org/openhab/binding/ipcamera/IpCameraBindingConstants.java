/**
 * Copyright (c) 2014,2018 by the respective copyright holders.
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.ipcamera;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link IpCameraBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Matthew Skinner - Initial contribution
 */
@NonNullByDefault
public class IpCameraBindingConstants {

    private static final String BINDING_ID = "ipcamera";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_NON_ONVIF = new ThingTypeUID(BINDING_ID, "NON_ONVIF");
    public static final ThingTypeUID THING_TYPE_ONVIF = new ThingTypeUID(BINDING_ID, "ONVIF");
    public static final ThingTypeUID THING_TYPE_AMCREST = new ThingTypeUID(BINDING_ID, "AMCREST");
    public static final ThingTypeUID THING_TYPE_AXIS = new ThingTypeUID(BINDING_ID, "AXIS");
    public static final ThingTypeUID THING_TYPE_FOSCAM = new ThingTypeUID(BINDING_ID, "FOSCAM");
    public static final ThingTypeUID THING_TYPE_HIKVISION = new ThingTypeUID(BINDING_ID, "HIKVISION");

    // List of all Thing Config items
    public static final String CONFIG_IPADDRESS = "IPADDRESS";
    public static final String CONFIG_PORT = "PORT";
    public static final String CONFIG_USE_HTTPS = "USE_HTTPS";
    public static final String CONFIG_ONVIF_PORT = "ONVIF_PORT";
    public static final String CONFIG_USERNAME = "USERNAME";
    public static final String CONFIG_PASSWORD = "PASSWORD";
    public static final String CONFIG_ONVIF_PROFILE_NUMBER = "ONVIF_MEDIA_PROFILE";
    public static final String CONFIG_POLL_CAMERA_MS = "POLL_CAMERA_MS";
    public static final String CONFIG_SNAPSHOT_URL_OVERIDE = "SNAPSHOT_URL_OVERIDE";
    public static final String CONFIG_IMAGE_UPDATE_EVENTS = "IMAGE_UPDATE_EVENTS";

    // List of all Channel ids
    public static final String CHANNEL_UPDATE_IMAGE_NOW = "updateImageNow";
    public static final String CHANNEL_IMAGE = "image";
    public static final String CHANNEL_VIDEO_URL = "videourl";
    public static final String CHANNEL_IMAGE_URL = "imageurl";
    public static final String CHANNEL_ABSOLUTE_PAN = "pan";
    public static final String CHANNEL_ABSOLUTE_TILT = "tilt";
    public static final String CHANNEL_ABSOLUTE_ZOOM = "zoom";
    public static final String CHANNEL_MOTION_ALARM = "motionAlarm";
    public static final String CHANNEL_AUDIO_ALARM = "audioAlarm";
    public static final String CHANNEL_ENABLE_MOTION_ALARM = "enableMotionAlarm";
    public static final String CHANNEL_ENABLE_AUDIO_ALARM = "enableAudioAlarm";
    public static final String CHANNEL_THRESHOLD_AUDIO_ALARM = "thresholdAudioAlarm";

}
