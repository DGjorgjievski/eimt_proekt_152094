import axios from "axios";
import { stringify } from "querystring";
import { API } from "../../config";

export const getLocals = async () => {
  try {
    var url = `${API}/locals`;
    const response = await axios.get(url);
    return response.data;
  } catch (error: any) {
    return null;
  }
};

export const makeReservation = async (data: any) => {
  try {
    var url = `${API}/reservations/save`;
    // const jsonData = JSON.stringify(data);
    // console.log("RESPONSE", jsonData);
    const response = await axios.post(url, {
      ...data,
    });
    return response.status;
  } catch (e: any) {
    console.log("ERROR", e);
  }
};

export const getUserReservations = async () => {
  try {
    var url = `${API}/users/1/reservations`;
    const response = await axios.get(url);    
    return response.data;
  } catch (error: any) {
    return null;
  }
};

export const deleteReservation = async (data: any) => {
  try {
    
    var url = `${API}/reservations/${data.id}`;
    // const jsonData = JSON.stringify(data);
    // console.log("RESPONSE", jsonData);
    const response = await axios.delete(url);
    return response.status;
  } catch (e: any) {
    console.log("ERROR", e);
  }
};

export const confirmReservation = async (data: any) => {
  try {
    var url = `${API}/reservations/${data.id}/confirm`;
    const response = await axios.post(url);
    return response.status;
  } catch (e: any) {
    console.log("ERROR", e);
  }
};