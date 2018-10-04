/*
 * Copyright (C) 2014-2018 SgrAlpha
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ingress.data.gdpr.models.records.mission;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

/**
 * @author SgrAlpha
 */
public class Mission {

    private final String title;
    private final String logoUrl;
    private final String badgeUrl;
    private final boolean enabled;
    private final ZonedDateTime creationTime;
    private final ZonedDateTime publishedTime;
    private final ZonedDateTime lastModifiedTime;
    private final List<MissionDetail> versions;

    public Mission(
            final String title, final String logoUrl, final String badgeUrl, final boolean enabled,
            final ZonedDateTime creationTime, final ZonedDateTime publishedTime, final ZonedDateTime lastModifiedTime,
            final List<MissionDetail> versions) {
        this.title = title;
        this.logoUrl = logoUrl;
        this.badgeUrl = badgeUrl;
        this.enabled = enabled;
        this.creationTime = creationTime;
        this.publishedTime = publishedTime;
        this.lastModifiedTime = lastModifiedTime;
        this.versions = versions;
    }

    public String getTitle() {
        return title;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public String getBadgeUrl() {
        return badgeUrl;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public ZonedDateTime getCreationTime() {
        return creationTime;
    }

    public ZonedDateTime getPublishedTime() {
        return publishedTime;
    }

    public ZonedDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public List<MissionDetail> getVersions() {
        return Collections.unmodifiableList(versions);
    }

}
