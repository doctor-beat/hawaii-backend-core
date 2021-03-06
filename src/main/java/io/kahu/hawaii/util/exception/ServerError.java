/**
 * Copyright 2015 Q24
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.kahu.hawaii.util.exception;

public enum ServerError implements HawaiiServerError {
    // @formatter: off
    ILLEGAL_ARGUMENT,
    UNEXPECTED_EXCEPTION,
    JSON,
    SAX,
    ENCRYPTION,
    MAIL_ERROR,
    SMS,
    PARSER_MAX_FILESIZE_EXCEEDED,
    GOOGLE_SERVER_ERROR,
    IO,
    CLIENTPROTOCOL,
    HTTPCONNECTION_NOT_CLOSED,
    INVALID_DATE,
    CACI_ERROR,
    BACKEND_CONNECTION_ERROR,
    DATABASE_CONNECTION_ERROR,
    URI_INVALID,
    METHOD_ERROR;
    // @formatter: on

    @Override
    public String getErrorName() {
        return toString();
    }

}
